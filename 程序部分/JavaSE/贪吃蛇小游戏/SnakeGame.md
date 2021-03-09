# Snake Game

## 将图片加载的程序中

* 利用反射找到编译后的图片的路径
* 必须先把图片封装成对象才能对其进行操作

```java
package com.bangdi.game;

import javax.swing.*;
import java.net.URL;

public class Images {
    public static URL bodyURL = Images.class.getResource("/images/body.jpg");
    public static ImageIcon   bodyImg = new ImageIcon(bodyURL);

    public static URL headUpURL = Images.class.getResource("/images/headUp.jpg");
    public static ImageIcon headUPImg = new ImageIcon(headUpURL);

    public static URL headDownURL = Images.class.getResource("/images/headDown.jpg");
    public static ImageIcon headDownImg = new ImageIcon(headDownURL);

    public static URL headRightURL = Images.class.getResource("/images/headRight.jpg");
    public static ImageIcon headRightImg = new ImageIcon(headRightURL);

    public static URL headLeftURL = Images.class.getResource("/images/headLeft.jpg");
    public static ImageIcon headLeftImg = new ImageIcon(headLeftURL);

    public static URL TopURL = Images.class.getResource("/images/Top.jpg");
    public static ImageIcon   topImg = new ImageIcon(TopURL);

    public static URL foodURL = Images.class.getResource("/images/food.jpg");
    public static ImageIcon   foodImg = new ImageIcon(foodURL);

}
```

## 创建窗体

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("贪吃蛇，永远滴神~");
        //设置大小不可调
        jf.setResizable(false);
        //获取屏幕长宽
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
        //创建面板
        GamePanel gp = new GamePanel();
        jf.add(gp);
        //窗体关闭时程序停止
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }
}
```

## 创建面板

```java
		package com.bangdi.game;

import javax.swing.*;
import java.awt.*;

public class GamePanel  extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this,g,7,-75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7,130,770,620);

    }
}
```

## 画静态小蛇

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];

    public GamePanel(){
        init();
    }
    public void init(){
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        Images.headRightImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }
    }
}
```

## 改变蛇头方向

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;

    public GamePanel() {
        init();
    }

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        direction = Direction.UP;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }
    }
}
```

## 加入监听控制游戏开始

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    isStart = !isStart;
                    repaint();
                }
            }
        });
    }

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        direction = Direction.UP;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

    }
}
```

## 将小蛇向右动起来

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;
    Timer timer;

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    isStart = !isStart;
                    repaint();
                }
            }
        });
    }

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        direction = Direction.RIGHT;
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    snakeX[0] += 25;
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

    }
}
```

## 小蛇上下左右动

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;
    Timer timer;

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    isStart = !isStart;
                    repaint();
                }
                if (keyCode == KeyEvent.VK_UP) {
                    direction = Direction.UP;
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = Direction.DOWN;
                }
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = Direction.LEFT;
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = Direction.RIGHT;
                }
            }
        });
    }

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        direction = Direction.RIGHT;
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    if (direction == Direction.UP) {
                        snakeY[0] -= 25;
                    }
                    if (direction == Direction.DOWN) {
                        snakeY[0] += 25;
                    }
                    if (direction == Direction.LEFT) {
                        snakeX[0] -= 25;
                    }
                    if (direction == Direction.RIGHT) {
                        snakeX[0] += 25;
                    }
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                    if (snakeX[0] < 0) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 125;
                    }
                    if (snakeY[0] < 125) {
                        snakeY[0] = 725;
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

    }
}
```

## 画食物吃食物

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;
    Timer timer;
    int foodX;
    int foodY;

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        foodX = 375;
        foodY = 375;
        direction = Direction.RIGHT;
    }

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    isStart = !isStart;
                    repaint();
                }
                if (keyCode == KeyEvent.VK_UP) {
                    direction = Direction.UP;
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = Direction.DOWN;
                }
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = Direction.LEFT;
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = Direction.RIGHT;
                }
            }
        });
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    if (direction == Direction.UP) {
                        snakeY[0] -= 25;
                    }
                    if (direction == Direction.DOWN) {
                        snakeY[0] += 25;
                    }
                    if (direction == Direction.LEFT) {
                        snakeX[0] -= 25;
                    }
                    if (direction == Direction.RIGHT) {
                        snakeX[0] += 25;
                    }
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                    if (snakeX[0] < 0) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 125;
                    }
                    if (snakeY[0] < 125) {
                        snakeY[0] = 725;
                    }
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        length++;
                        //[25,725]  [125,700]
                        foodX = ((int) (Math.random() * 29 + 1)) * 25;//[25,725]
                        foodY = ((int) (Math.random() * 24 + 5)) * 25;//[125,700]
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

        Images.foodImg.paintIcon(this, g, foodX, foodY);

    }
}
```

## 画积分

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;
    Timer timer;
    int foodX;
    int foodY;
    int score;

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        foodX = 375;
        foodY = 375;
        direction = Direction.RIGHT;
    }

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    isStart = !isStart;
                    repaint();
                }
                if (keyCode == KeyEvent.VK_UP) {
                    direction = Direction.UP;
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = Direction.DOWN;
                }
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = Direction.LEFT;
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = Direction.RIGHT;
                }
            }
        });
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    if (direction == Direction.UP) {
                        snakeY[0] -= 25;
                    }
                    if (direction == Direction.DOWN) {
                        snakeY[0] += 25;
                    }
                    if (direction == Direction.LEFT) {
                        snakeX[0] -= 25;
                    }
                    if (direction == Direction.RIGHT) {
                        snakeX[0] += 25;
                    }
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                    if (snakeX[0] < 0) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 125;
                    }
                    if (snakeY[0] < 125) {
                        snakeY[0] = 725;
                    }
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        length++;
                        //[25,725]  [125,700]
                        foodX = ((int) (Math.random() * 29 + 1)) * 25;//[25,725]
                        foodY = ((int) (Math.random() * 24 + 5)) * 25;//[125,700]
                        score += 10;
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

        Images.foodImg.paintIcon(this, g, foodX, foodY);

        g.setColor(new Color(94, 186, 172));
        g.setFont(new Font("微软雅黑", Font.BOLD, 30));
        g.drawString("积分：" + score, 650, 100);

    }
}
```

## 死亡判定

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;
    Timer timer;
    int foodX;
    int foodY;
    int score;
    boolean isDie;

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        foodX = 375;
        foodY = 375;
        direction = Direction.RIGHT;
        isDie = true;
    }

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    if (!isDie) {
                        init();
                    } else {
                        isStart = !isStart;
                        repaint();
                    }
                }
                if (keyCode == KeyEvent.VK_UP) {
                    direction = Direction.UP;
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = Direction.DOWN;
                }
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = Direction.LEFT;
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = Direction.RIGHT;
                }
            }
        });
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart && isDie) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    if (direction == Direction.UP) {
                        snakeY[0] -= 25;
                    }
                    if (direction == Direction.DOWN) {
                        snakeY[0] += 25;
                    }
                    if (direction == Direction.LEFT) {
                        snakeX[0] -= 25;
                    }
                    if (direction == Direction.RIGHT) {
                        snakeX[0] += 25;
                    }
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                    if (snakeX[0] < 0) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 125;
                    }
                    if (snakeY[0] < 125) {
                        snakeY[0] = 725;
                    }
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        length++;
                        //[25,725]  [125,700]
                        foodX = ((int) (Math.random() * 29 + 1)) * 25;//[25,725]
                        foodY = ((int) (Math.random() * 24 + 5)) * 25;//[125,700]
                        score += 10;
                    }
                    for (int i = 1; i < length; i++) {
                        if (snakeX[i] == snakeX[0] && snakeY[i] == snakeY[0]) {
                            isDie = !isDie;
                        }
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

        Images.foodImg.paintIcon(this, g, foodX, foodY);

        g.setColor(new Color(94, 186, 172));
        g.setFont(new Font("微软雅黑", Font.BOLD, 30));
        g.drawString("积分：" + score, 650, 100);

        if (!isDie) {
            g.setColor(new Color(114, 236, 193, 221));
            g.setFont(new Font("微软雅黑", Font.BOLD, 50));
            g.drawString("游戏结束，按下空格重新开始", 75, 400);
        }
    }
}
```

## 游戏打包



# 总结

## 图片包装类

图片文件需要包装成ImageIcon对象方便调用

```java
    public static URL topURL = Images.class.getResource("/images/Top.jpg");
    public static ImageIcon topImg = new ImageIcon(topURL);
```

这里采用反射的原因在于，后续需要将文件打包，打包后的文件就不在本地了

## 游戏窗体类

游戏需要在一个窗体（JFrame）上运行

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("贪吃蛇");
        jf.setResizable(false);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
        GamePanel gp = new GamePanel();
        jf.add(gp);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
```

获得屏幕的宽，高，之后通过一个算法将窗体放在屏幕正中间

还需设置不可调节，可见性，退出时终止程序

后续写好面板后还需要将写好的面板添加到窗体上

## 游戏面板类

游戏真正运行的地方

```java
package com.bangdi.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel {
    enum Direction {
        UP, DOWN, RIGHT, LEFT
    }

    int length;
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    Direction direction;
    boolean isStart = false;
    Timer timer;
    int foodX;
    int foodY;
    int score;
    boolean isDie;

    public void init() {
        length = 3;
        snakeX[0] = 175;
        snakeY[0] = 275;
        snakeX[1] = 150;
        snakeY[1] = 275;
        snakeX[2] = 125;
        snakeY[2] = 275;
        foodX = 375;
        foodY = 375;
        direction = Direction.RIGHT;
        isDie = true;
    }

    public GamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    if (!isDie) {
                        init();
                    } else {
                        isStart = !isStart;
                        repaint();
                    }
                }
                if (keyCode == KeyEvent.VK_UP) {
                    direction = Direction.UP;
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = Direction.DOWN;
                }
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = Direction.LEFT;
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = Direction.RIGHT;
                }
            }
        });
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart && isDie) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    if (direction == Direction.UP) {
                        snakeY[0] -= 25;
                    }
                    if (direction == Direction.DOWN) {
                        snakeY[0] += 25;
                    }
                    if (direction == Direction.LEFT) {
                        snakeX[0] -= 25;
                    }
                    if (direction == Direction.RIGHT) {
                        snakeX[0] += 25;
                    }
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                    if (snakeX[0] < 0) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 125;
                    }
                    if (snakeY[0] < 125) {
                        snakeY[0] = 725;
                    }
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        length++;
                        //[25,725]  [125,700]
                        foodX = ((int) (Math.random() * 29 + 1)) * 25;//[25,725]
                        foodY = ((int) (Math.random() * 24 + 5)) * 25;//[125,700]
                        score += 10;
                    }
                    for (int i = 1; i < length; i++) {
                        if (snakeX[i] == snakeX[0] && snakeY[i] == snakeY[0]) {
                            isDie = !isDie;
                        }
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

        Images.foodImg.paintIcon(this, g, foodX, foodY);

        g.setColor(new Color(94, 186, 172));
        g.setFont(new Font("微软雅黑", Font.BOLD, 30));
        g.drawString("积分：" + score, 650, 100);

        if (!isDie) {
            g.setColor(new Color(114, 236, 193, 221));
            g.setFont(new Font("微软雅黑", Font.BOLD, 50));
            g.drawString("游戏结束，按下空格重新开始", 75, 400);
        }
    }
}
```

### 绘制部分

```java
protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(231, 218, 205));
        Images.topImg.paintIcon(this, g, 7, -75);
        g.setColor(new Color(208, 234, 202));
        g.fillRect(7, 130, 770, 620);

        switch (direction) {
            case UP:
                Images.headUPImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case DOWN:
                Images.headDownImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case LEFT:
                Images.headLeftImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case RIGHT:
                Images.headRightImg.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }

        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (!isStart) {
            g.setColor(new Color(94, 186, 172));
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 250, 200);
        }

        Images.foodImg.paintIcon(this, g, foodX, foodY);

//        g.setColor(new Color(94, 186, 172));
        g.setFont(new Font("微软雅黑", Font.BOLD, 30));
        g.drawString("积分：" + score, 650, 100);

        if (!isDie) {
            g.setColor(new Color(114, 236, 193, 221));
            g.setFont(new Font("微软雅黑", Font.BOLD, 50));
            g.drawString("游戏结束，按下空格重新开始", 75, 400);
        }
    }
```

这部分负责面板的绘制，什么情况会出现什么画面

### 监听部分

```java
 this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_SPACE) {
                    if (!isDie) {
                        init();
                    } else {
                        isStart = !isStart;
                        repaint();
                    }
                }
                if (keyCode == KeyEvent.VK_UP) {
                    direction = Direction.UP;
                }
                if (keyCode == KeyEvent.VK_DOWN) {
                    direction = Direction.DOWN;
                }
                if (keyCode == KeyEvent.VK_LEFT) {
                    direction = Direction.LEFT;
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    direction = Direction.RIGHT;
                }
            }
        });
```

这部分负责监听键盘动作（需要先设置监听焦点）

原理：先通过e.getKeyCode()获取相应的keyCode再通过if语句对不同的keyCode做出相应的反应

### 计时器部分

```java
timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart && isDie) {
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    if (direction == Direction.UP) {
                        snakeY[0] -= 25;
                    }
                    if (direction == Direction.DOWN) {
                        snakeY[0] += 25;
                    }
                    if (direction == Direction.LEFT) {
                        snakeX[0] -= 25;
                    }
                    if (direction == Direction.RIGHT) {
                        snakeX[0] += 25;
                    }
                    if (snakeX[0] > 750) {
                        snakeX[0] = 0;
                    }
                    if (snakeX[0] < 0) {
                        snakeX[0] = 750;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 125;
                    }
                    if (snakeY[0] < 125) {
                        snakeY[0] = 725;
                    }
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        length++;
                        //[25,725]  [125,700]
                        foodX = ((int) (Math.random() * 29 + 1)) * 25;//[25,725]
                        foodY = ((int) (Math.random() * 24 + 5)) * 25;//[125,700]
                        score += 10;
                    }
                    for (int i = 1; i < length; i++) {
                        if (snakeX[i] == snakeX[0] && snakeY[i] == snakeY[0]) {
                            isDie = !isDie;
                        }
                    }
                }
                repaint();
            }
        });
        timer.start();
```

主要负责让小蛇动起来，以及死亡判定

让小蛇动起来的原理：帧动画，每过0.1秒就重新绘制一副图画，同样每过0.1秒小蛇坐标就会自动改变，看起来就像是小蛇在动

这里有一个很精妙的地方在于，小蛇是怎么通过吃东西变长的呢？答案是length实际上小蛇数组的长度一开始就已经定好了就是200，但是因为length的存在，绘制部分每次只会绘制length节小蛇的身子，而我们在吃到食物后length++，并且马上就会有for循环对其赋值，所以绘制出来的就会是在小蛇的末尾

