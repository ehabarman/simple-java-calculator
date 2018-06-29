import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Calculator extends Application  {
	
	public static void main(String[] args) {
	
        Application.launch(args);
        
    }
	
	  public void start(Stage stage) {
		  
		  StackPane stackpane= new StackPane();
		  Image image = new Image("/kevin-lumoindong-tracervray3.jpg",true);
		  ImageView iv1 = new ImageView(image);
		  stackpane.getChildren().add(iv1);
		 
	     
	       stage.setTitle("Ehab's calculator");
	       Button num0= new Button("0");
	       Button num1= new Button("1");
	       Button num2= new Button("2");
	       Button num3= new Button("3");
	       Button num4= new Button("4");
	       Button num5= new Button("5");
	       Button num6= new Button("6");
	       Button num7= new Button("7");
	       Button num8= new Button("8");
	       Button num9= new Button("9");
	       Button div= new Button("÷");
	       Button mul= new Button("×");
	       Button add= new Button("+");
	       Button sub= new Button("-");
	       Button eq= new Button("=");
	       Button ce= new Button("CE");
	       Button c= new Button("C");
	       Button remove= new Button("del");
	       Button dot= new Button(".");
	       Button minus= new Button("+/-");
	       TextField screen1 = new TextField();
	       TextField screen2 = new TextField();
	       GridPane pane1 = new GridPane();
	       GridPane pane2 = new GridPane();
	       VBox v = new VBox();
	       
	       pane1.add(screen1, 1, 1);
	       pane1.add(screen2, 1, 2);
	       
	   
	       pane2.add(ce, 1, 2);
	       pane2.add(c, 2, 2);
	       pane2.add(remove, 3, 2);
	       pane2.add(div, 4, 2);
	       pane2.add(num7, 1, 3);
	       pane2.add(num8, 2, 3);
	       pane2.add(num9, 3, 3);
	       pane2.add(mul, 4, 3);
	       pane2.add(num4, 1, 4);
	       pane2.add(num5, 2, 4);
	       pane2.add(num6, 3, 4);
	       pane2.add(sub, 4, 4);
	       pane2.add(num1, 1, 5);
	       pane2.add(num2, 2, 5);
	       pane2.add(num3, 3, 5);
	       pane2.add(add, 4, 5);
	       pane2.add(minus, 1, 6);
	       pane2.add(num0, 2, 6);
	       pane2.add(dot, 3, 6);
	       pane2.add(eq, 4, 6);
	       
	       screen1.setPrefSize(300,30);
	       screen2.setPrefSize(300,30);
	       num0.setPrefSize(75,30);
	       num1.setPrefSize(75,30);
	       num2.setPrefSize(75,30);
	       num3.setPrefSize(75,30);
	       num4.setPrefSize(75,30);
	       num5.setPrefSize(75,30);
	       num6.setPrefSize(75,30);
	       num7.setPrefSize(75,30);
	       num8.setPrefSize(75,30);
	       num9.setPrefSize(75,30);
	       mul.setPrefSize(75,30);
	       div.setPrefSize(75,30);
	       dot.setPrefSize(75,30);
	       minus.setPrefSize(75,30);
	       sub.setPrefSize(75,30);
	       add.setPrefSize(75,30);
	       eq.setPrefSize(75,30);
	       ce.setPrefSize(75,30);
	       c.setPrefSize(75,30);
	       remove.setPrefSize(75, 30);
     
	       screen1.setDisable(true);
	       screen2.setDisable(true);
	            
	       screen1.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       screen2.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num0.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num1.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num2.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num3.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num4.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num5.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num6.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num7.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num8.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       num9.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       add.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       sub.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       mul.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       dot.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       div.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       minus.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       remove.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       eq.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       c.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	       ce.setBorder(new Border(new BorderStroke(Color.BLACK, 
	    		   BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
	   
	       Scene scene = new Scene(stackpane);
	       
	       v.setPrefSize(300, 205);
	       v.getChildren().add(pane1);
	       v.getChildren().add(pane2);
	       stackpane.getChildren().add(v);
	       stackpane.setAlignment(Pos.CENTER);
	       pane1.setAlignment(Pos.CENTER);
	       pane2.setAlignment(Pos.CENTER);
	       v.setAlignment(Pos.CENTER);
	       num0.setOnAction(e->{
	    	   
	    	   addNum(0,screen1,screen2);  
	       });
	       
	       num1.setOnAction(e->{
	    	   
	    	   addNum(1,screen1,screen2);  
	    	   
	       });
	       
	       
	       num2.setOnAction(e->{
	    	   
	    	   addNum(2,screen1,screen2);  
	    	   
	       });
	       
	       num3.setOnAction(e->{
	    	   
	    	   addNum(3,screen1,screen2);  
	       });
	       
	       num4.setOnAction(e->{
	    	   
	    	   addNum(4,screen1,screen2);  
	    	   
	       });
	       
	       num5.setOnAction(e->{
	    	   
	    	   addNum(5,screen1,screen2);  
	    	   
	       });
	       
	       num6.setOnAction(e->{
	    	   
	    	   addNum(6,screen1,screen2);  
	    	   
	       });
	       
	       num7.setOnAction(e->{
	    	   
	    	   addNum(7,screen1,screen2);  
	    	   
	       });
	       
	       num8.setOnAction(e->{
	    	   
	    	   addNum(8,screen1,screen2);  
	    	   
	       });
	       
	       num9.setOnAction(e->{
	    	   
	    	   addNum(9,screen1,screen2);  
	    	   
	       });
	       
	       remove.setOnAction(e->{
	    	   
	    	   backspace(screen1,screen2);
	       });
	       add.setOnAction(e->{
	    	   
	    	   addOp('+',screen1,screen2);
	       });
	       sub.setOnAction(e->{
	    	   
	    	   addOp('-',screen1,screen2);
	       });
	       
	       mul.setOnAction(e->{
	    	   
	    	   addOp('*',screen1,screen2);
	       });
	       
	       div.setOnAction(e->{
	    	   
	    	   addOp('/',screen1,screen2);
  
	       });
	       c.setOnAction(e->{
	    	
	    	screen1.setText("");
	    	screen2.setText("");
	    	   
	       });
	       
	       ce.setOnAction(e->{
	    	   
	    	 screen1.setText("");
	    	 screen2.setText(""); 
	       });
	       
	       
	       	minus.setOnAction(e->{
		    	   
		    	   if(screen1.getText().equals("invalid"))
		    		   screen1.setText("");
		    	   
	       		if(!screen1.getText().equals(""))
	       		{
	       		  double result= Double.parseDouble(screen1.getText());
		    	   result*=-1;
		    	   screen1.setText(""+result);
	       		}
	   
	       });
	       	
	       	dot.setOnAction(e->{
		    	decimal(screen1,screen2);   
	       		
	       	});
	       
	       	eq.setOnAction(e->{
		    	calc(screen1,screen2);
	       	});
	     
		      scene.setOnKeyPressed(e->{
		    	  switch(e.getCode()){//import javafx.scene.input.KeyCode;
		    	  case NUMPAD0:addNum(0,screen1,screen2);   
		    		  break;
		    	  case NUMPAD1:addNum(1,screen1,screen2);  
		    		  break;
		    	  case NUMPAD2:addNum(2,screen1,screen2);  
		    		  break;
		    	  case NUMPAD3:addNum(3,screen1,screen2);  
		    		  break;
		    	  case NUMPAD4:addNum(4,screen1,screen2);  
		    		  break;
		    	  case NUMPAD5: addNum(5,screen1,screen2);  
		    		  break;
		    	  case NUMPAD6: addNum(6,screen1,screen2);  
		    		  break;
		    	  case NUMPAD7: addNum(7,screen1,screen2);  
		    		  break;
		    	  case NUMPAD8: addNum(8,screen1,screen2);  
		    		  break;
		    	  case NUMPAD9: addNum(9,screen1,screen2);  
		    		  break;
		    	  case DIGIT0:  addNum(0,screen1,screen2);  
		    		  break;
		    	  case DIGIT1:addNum(1,screen1,screen2);  
		    		  break;
		    	  case DIGIT2: addNum(2,screen1,screen2);  
		    		  break;
		    	  case DIGIT3:addNum(3,screen1,screen2);  
		    		  break;
		    	  case DIGIT4: addNum(4,screen1,screen2);  
		    		  break;
		    	  case DIGIT5: addNum(5,screen1,screen2);  
		    		  break;
		    	  case DIGIT6:addNum(6,screen1,screen2);   
		    		  break;
		    	  case DIGIT7:addNum(7,screen1,screen2);  
		    		  break;
		    	  case DIGIT8:addNum(8,screen1,screen2);  
		    		  break;
		    	  case DIGIT9: addNum(9,screen1,screen2);  
			    	  break;
		    		  
		    	  case DELETE:
		    		 screen1.setText("");
			    	 screen2.setText(""); 
		    		  break;
		    	  case ENTER: calc(screen1,screen2);
		    		  break; 
		    	  case ADD:  addOp('+',screen1,screen2);
		    		  break;
		    	  case SUBTRACT: addOp('-',screen1,screen2);
		    		  break;
		    	  case DIVIDE: addOp('/',screen1,screen2);
		    		  break;
		    	  case MULTIPLY: addOp('*',screen1,screen2);
		    		  break;
		    	  case DECIMAL: decimal(screen1,screen2);  
		    		  break;
		    		  
		    	  case BACK_SPACE: backspace(screen1,screen2);
		    		  break;
		    	  case MINUS: addOp('-',screen1,screen2);
		    		  break;
		    	  case ESCAPE: stage.close();
		    	  break;
		    	  case EQUALS: calc(screen1,screen2);
		    		  break ;
				default:
					break;
		    	  }
		    	  
		      });
	       stage.setMaximized(true);
	       stage.setScene(scene);
	       stage.show();
	  }
	  public static void backspace(TextField screen1,TextField screen2)
	  {
		  if(screen1.getText().equals("invalid"))
   		   screen1.setText("");
   	   
	    	String text = screen2.getText();
	    	
	    	if(!text.equals(""))
	    	screen2.setText(text.substring(0, text.length()-1));
	  }
	  public static void addNum(int num,TextField screen1,TextField screen2)
	  {
		  if(screen1.getText().equals("invalid"))
   		   screen1.setText("");
   	   
   	   if(!screen1.getText().equals("")&&screen2.getText().equals(""))
   		   
   	   {   	
   		   screen1.setText("");
   		   screen2.setText(""+num);
   	   }
   	   else
   	   {
   		   
   	String text = screen2.getText();
   	if(screen2.getText().equals(""))
   		text +=""+num;
   	else if(text.charAt(text.length()-1)=='*'||text.charAt(text.length()-1)=='/'
   			||text.charAt(text.length()-1)=='+'||text.charAt(text.length()-1)=='-')
   	text +=" "+num;
   	else
   	text +=""+num;
   	
   	screen2.setText(text);
   	
   	
   	
   	   } 
	  }
	  public static void addOp(char op,TextField screen1,TextField screen2)
	  {
		  if(screen1.getText().equals("invalid"))
   		   screen1.setText("");
   	   
   	   String text;
   	   if(!screen1.getText().equals("")&&screen2.getText().equals(""))
		   {
		   text=screen1.getText();
		   screen1.setText("");
		   screen2.setText(text+" "+op);
		   }
	   else if(screen1.getText().equals("")&&screen2.getText().equals(""))
	   {
		   screen2.setText(0+" "+op);
	   }
	   else if(screen2.getText().charAt(screen2.getText().length()-1)=='*'
			   ||screen2.getText().charAt(screen2.getText().length()-1)=='-'
			   ||screen2.getText().charAt(screen2.getText().length()-1)=='+'
			   ||screen2.getText().charAt(screen2.getText().length()-1)=='/')
	   {
		   text=screen2.getText();
		   screen2.setText(text.substring(0,text.length()-1)+""+op);
		   
	   }
	   else{
		   
		  text = screen2.getText();
	    	text +=" "+op;
	    	screen2.setText(text);  
	   } 
	  }
	  public static void decimal(TextField screen1,TextField screen2)
	  {
		  if(screen1.getText().equals("invalid"))
   		   screen1.setText("");
   	   
  		String text = screen2.getText();
  		boolean dotUsed=false;
  		int i=text.length()-1;
  		if(!screen1.getText().equals("")&&screen2.getText().equals(""))
   	   {
   		   screen1.setText("");
   	   }
  		while(i>=0&&!text.equals(""))
  		{
  			if(text.charAt(i)=='.')
  			{
  				dotUsed=true;
  				break;
  			}
  			else if (text.charAt(i)=='*'||text.charAt(i)=='/'||text.charAt(i)=='+'||text.charAt(i)=='-')
  			{
  				dotUsed=false;
  				break;
  			}
  			i--;
  		}
  		
  		if(!dotUsed)
  		{
  			if(text.equals(""))
      			text+="0.";
      		else if (text.charAt(text.length()-1)=='*'||text.charAt(text.length()-1)=='/'
      			||text.charAt(text.length()-1)=='+'||text.charAt(text.length()-1)=='-')
      		{
      			text +=" 0.";
      			
      		}
      		else
      		{
      			text+=".";
      			
      		}
  			screen2.setText(text);	
  		}  
	  }
	  public static void calc(TextField screen1,TextField screen2)
	  {
		  String text = screen2.getText();
     		
	    	if(screen1.getText().equals("invalid"))
	    		 screen1.setText("");
	    	   
     		
	    	else if(!text.equals(""))
     		{
	    		
     			String[] postFix= new InToPost(text).doTrans().split(" "); 
     			String[] stack = new String[postFix.length];
     			int stackIndex=-1;
     			double op1=0,op2=0;
     			for(int i=0;i<postFix.length;i++)
     				{
     					if(postFix[i].equals("+")||postFix[i].equals("-")
     						||postFix[i].equals("*")||postFix[i].equals("/"))
     					{
     						switch(postFix[i].charAt(0))
     						{
     						case '+':if(stackIndex>=1){
     							op1=Double.parseDouble(stack[stackIndex--]);
     							op2=Double.parseDouble(stack[stackIndex--]);
     						stack[++stackIndex]=""+(op2+op1);	
     						}
     						else
     							{
     							op1=Double.parseDouble(stack[stackIndex--]);
     							stack[++stackIndex]=""+(op1+op1);
     							}
     							
     						
     							break;
     						case '-':if(stackIndex>=1){
     							op1=Double.parseDouble(stack[stackIndex--]);
     							op2=Double.parseDouble(stack[stackIndex--]);
     						stack[++stackIndex]=""+(op2-op1);	
     						}
     						else
     							{
     							op1=Double.parseDouble(stack[stackIndex--]);
     							stack[++stackIndex]=""+(op1-op1);
     							}
     							break;
     						case '*':if(stackIndex>=1){
     							op1=Double.parseDouble(stack[stackIndex--]);
     							op2=Double.parseDouble(stack[stackIndex--]);
     						stack[++stackIndex]=""+(op2*op1);	
     						}
     						else
     							{
     							op1=Double.parseDouble(stack[stackIndex--]);
     							stack[++stackIndex]=""+(op1*op1);
     							}
     							break;
     						case '/':if(stackIndex>=1){
     							op1=Double.parseDouble(stack[stackIndex--]);
     							op2=Double.parseDouble(stack[stackIndex--]);
     						stack[++stackIndex]=""+(op2/op1);	
     						}
     						else
     							{
     							op1=Double.parseDouble(stack[stackIndex--]);
     							stack[++stackIndex]=""+(op1/op1);
     							}
     							break;
     						}
     					}
     					else
     					{
     						stack[++stackIndex]=postFix[i];
     					}
     				}
     			screen1.setText(stack[0]);
     			screen2.setText("");
     		
     				
     		}
     		else
     		{
     		screen1.setText("invalid");
     		screen2.setText("");
     		} 
	  }
}
class InToPost {
	   private Stack theStack;
	   private String input;
	   private String output = "";
	   public InToPost(String in) {
	      input = in;
	      int stackSize = input.length();
	      theStack = new Stack(stackSize);
	   }
	   public String doTrans() {
	      for (int j = 0; j < input.length(); j++) {
	         char ch = input.charAt(j);
	         switch (ch) {
	            case '+': 
	            case '-':
	            gotOper(ch, 1); 
	            break; 
	            case '*': 
	            case '/':
	            gotOper(ch, 2); 
	            break; 
	            case '(': 
	            theStack.push(ch);
	            break;
	            case ')': 
	            gotParen(ch); 
	            break;
	            default: 
	            		if(output.length()==0)
	            			output = output + ch; 
	            		
	            		else if(output.charAt(output.length()-1)==' '&&ch==' ')
	            			continue;
	            		else if(output.charAt(output.length()-1)!=' '&&(ch=='+'||ch=='-'||ch=='*'||ch=='/'))
	            			output = output+" "+ch;
	            		else
	            			output = output + ch; 
	            
	            break;
	         }
	      }
	      while (!theStack.isEmpty()) {
	    		if(output.charAt(output.length()-1)!=' ')
	         output = output +" "+theStack.pop();
	    		else
	    			 output = output +theStack.pop();	
	      }
	     
	      return output; 
	   }
	   public void gotOper(char opThis, int prec1) {
	      while (!theStack.isEmpty()) {
	         char opTop = theStack.pop();
	         if (opTop == '(') {
	            theStack.push(opTop);
	            break;
	         }
	         else {
	            int prec2;
	            if (opTop == '+' || opTop == '-')
	            prec2 = 1;
	            else
	            prec2 = 2;
	            if (prec2 < prec1) { 
	               theStack.push(opTop);
	               break;
	            }
			    else
			    {
			    	if(output.charAt(output.length()-1)!=' ')
			    		output = output +" "+ opTop;
			    	else
			    		output = output + opTop;
			    }
	          
	         }
	      }
	      theStack.push(opThis);
	   }
	   public void gotParen(char ch){ 
	      while (!theStack.isEmpty()) {
	         char chx = theStack.pop();
	         if (chx == '(') 
	         break; 
	         else
	         output = output + chx; 
	      }
	   }
}	 
	   
class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;
    public Stack(int max) {
       maxSize = max;
       stackArray = new char[maxSize];
       top = -1;
    }
    public void push(char j) {
       stackArray[++top] = j;
    }
    public char pop() {
       return stackArray[top--];
    }
    public char peek() {
       return stackArray[top];
    }
    public boolean isEmpty() {
       return (top == -1);
   }
 }