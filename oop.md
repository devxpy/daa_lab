## features of oop

- data hiding

- polymorphism

- encapsulation

- overloading

- reusability

- inheritance

  

## types of constructors

- zero argument / default constructor
- parameterized constructor
- explicit constructor
- copy constructor

## buzzwords

- simple and powerful
- object-oriented
- robust
- multithread
- arch-neutral
- distributed
- interpreted and high perf
- dynamic
- easy to learn



## Typecasting

```
				 --> widening (implicit) -->				

byte -> short -> int -> long -> float -> double

			   <— narrowing (explicit) <--	
```

```java
// widening
int x = 100;
float y = x;
double z = x;

// narrowing
double x = 100.78;
float y = (float) x;
int z = (int) x
```

## applet skeleton

```java
<APPLET
  CODE = appleFile
  WIDTH = pixels
  HEIGHT = pixels
	[CODEBASE = codebaseUrl]
  [ALT = alternateText]
  [NAME = name]
  [ALIGN = alignment]
  [VSPACE = pixels]
  [HSPACE = pixels]
>

[<PARAM NAME=apletParam1 VALUE=appletValue1>]
...

[alternateHTML]

</APPLET>
```

## Events

### key events

`for i in [press, release, type]: "KEY_{i}ED"`

```java
  KeyEvent(Component src, int type, float when, int modifiers, 
           int code, char ch)
```



`getKeyChar()` - `CHAR_UNKNOWN` when key char is not known.

`getKeyode()` - `VK_UNDEFINED` when `KEY_TYPED` event occurs. Otherwise, `VK_UP`, `VK_A` etc.



### mouse events

`for i in [click, drag, enter, exit, move, press, release, wheel]: "MOUSE_{i}ED"`	

```java
MouseEvent(Component src, int type, float when, int modifiers, 
           int x, int y, int clicks, bool triggersPopup)
```

`getX()`, `getY()`, `getClickCount()`, `isPopupTrigger()`, `getPoint()`

## containers

- top level containers - `JFrame`, `JApplet`, `JWindow` , `JDialog`. They *don't* inherit from `JComponent`

- lightweight containers, like - `JPanel` -  They _do_ inherit from `JComponent`

## uses of super

- to call superclass constructor
- to access hidden attributes of superclass

## Formula

- Combo-box get item - `cb.getSelectedItem()` or `cb.getItemAt(cb.getSelectedIndex())`
- `Float.parseFloat()`, `Integer.parseInt()`, throws - `NumberFormatException`
- `JLabel(String, Icon, int)`
- `JTextField(String str, int cols)`
- `JTabbedPane()`, `JTabbedPane.addPane(String name, Component comp)`
- `JScollPane(Component comp)`
- `JList(Object[] items)`
- `JComboBox(Object[] items)`
- `JTable(Object[][] data, Object[] head)`
- `addWindowListener -> WindowAdapter -> windowClosing(WindowEvent e)`
- `addActionListener -> ActionListener -> actionPerformed(ActionEvent e)`
- `addListSelectionListener -> ListSelectionListener -> valueChanged(ListSelectionEvent e)`
- 

|           | class | same package | different package subclass | diffrent package non-subclass |
| --------- | ----- | ------------ | -------------------------- | ----------------------------- |
| public    | ✔     | ✔            | ✔                          | ✔                             |
| protected | ✔     | ✔            | ✔                          | ✗                             |
| no mod    | ✔     | ✔            | ✗                          | ✗                             |
| private   | ✔     | ✗            | ✗                          | ✗                             |