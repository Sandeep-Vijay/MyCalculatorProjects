import tkinter
from tkinter import *

#creating the window for calculator
window=Tk()
window.title("CALCULATOR")
window.geometry("366x416")
window.config(bg="gray13")
window.resizable(0,0)


#actions when buttons are clicked
def c_clicked():
  global expression
  expression=""
  lb.set("")
def dot_clicked(dot):
    dotpress=lb.get()+str(dot)
    if dotpress.count(dot)<=1:
        lb.set(dotpress)
    else:print("")

def buttonclicked(num):
  global expression
  expression=lb.get()+str(num)
  lb.set(expression)

def operator_clicked(oper):
    global value



    if oper=="+":
        buttonminus.config(highlightbackground="gray13")
        buttonmulti.config(highlightbackground="gray13")
        buttondiv.config(highlightbackground="gray13")
        buttonplus.config(highlightbackground="orange")
    elif oper=="-":
        buttonmulti.config(highlightbackground="gray13")
        buttondiv.config(highlightbackground="gray13")
        buttonplus.config(highlightbackground="gray13")
        buttonminus.config(highlightbackground="orange")
    elif oper=="/":
        buttonminus.config(highlightbackground="gray13")
        buttonmulti.config(highlightbackground="gray13")
        buttonplus.config(highlightbackground="gray13")
        buttondiv.config(highlightbackground="orange")
    elif oper=="*":
        buttondiv.config(highlightbackground="gray13")
        buttonplus.config(highlightbackground="gray13")
        buttonminus.config(highlightbackground="gray13")
        buttonmulti.config(highlightbackground="orange")

    value=lb.get()+str(oper)

    lb.set("")

def percentage():
    global expression
    global result
    per=lb.get()
    value=100
    result=int(per)/value
    lb.set(result)

def minus():
    global expression
    value=int(lb.get())
    result=-value
    lb.set(str(result))

def equal_clicked():
   global expression
   global value
   global result
   buttonplus.config(highlightbackground="gray13")
   buttonminus.config(highlightbackground="gray13")
   buttondiv.config(highlightbackground="gray13")
   buttonmulti.config(highlightbackground="gray13")
   total=value+expression
   result=str(eval(total))
   lb.set(result)
   expression=""



#creating the label for display numbers
lb=StringVar()
label=Label(window,bg="gray13",fg="white",anchor="se",width=15,height=2,font=('times',47),textvariable=lb,text="kichu")
label.grid(row=0,columnspan=4)


expression=""
result=""
#creating buttons for calculator
buttonequal=Button(window,text="=",width=6,height=3,command=lambda:equal_clicked(),highlightbackground="gray13")
buttonequal.grid(row=5,column=3)

buttondiv=Button(window,text="/",width=6,height=3,command=lambda:operator_clicked("/"),highlightbackground="gray13")
buttondiv.grid(row=1,column=3)

buttonmulti=Button(window,text="x",width=6,height=3,command=lambda:operator_clicked("*"),highlightbackground="gray13")
buttonmulti.grid(row=2,column=3)

buttonminus=Button(window,text="-",width=6,height=3,command=lambda:operator_clicked("-"),highlightbackground="gray13")
buttonminus.grid(row=3,column=3)

buttonplus=Button(window,text="+",width=6,height=3,command=lambda:operator_clicked("+"),highlightbackground="gray13")
buttonplus.grid(row=4,column=3)


buttonc=Button(window,text="C",width=6,height=3,command=lambda:c_clicked(),highlightbackground="gray13")
buttonc.grid(row=1,column=0)

buttonposneg=Button(window,text="+/-",width=6,height=3,command=lambda:minus(),highlightbackground="gray13")
buttonposneg.grid(row=1,column=1)

buttonper=Button(window,bg="red",text="%",width=6,height=3,command=lambda:percentage(),highlightbackground="gray13")
buttonper.grid(row=1,column=2)

buttonseven=Button(window,text="7",width=6,height=3,command=lambda:buttonclicked(7),highlightbackground="gray13")
buttonseven.grid(row=2,column=0)

buttoneight=Button(window,text="8",width=6,height=3,command=lambda:buttonclicked(8),highlightbackground="gray13")
buttoneight.grid(row=2,column=1)

buttonnine=Button(window,text="9",width=6,height=3,command=lambda:buttonclicked(9),highlightbackground="gray13")
buttonnine.grid(row=2,column=2)

buttonsix=Button(window,text="6",width=6,height=3,command=lambda:buttonclicked(6),highlightbackground="gray13")
buttonsix.grid(row=3,column=0)

buttonfive=Button(window,text="5",width=6,height=3,command=lambda:buttonclicked(5),highlightbackground="gray13")
buttonfive.grid(row=3,column=1)

buttonfour=Button(window,text="4",width=6,height=3,command=lambda:buttonclicked(4),highlightbackground="gray13")
buttonfour.grid(row=3,column=2)

buttonthree=Button(window,text="3",width=6,height=3,command=lambda:buttonclicked(3),highlightbackground="gray13")
buttonthree.grid(row=4,column=0)

buttontwo=Button(window,text="2",width=6,height=3,command=lambda:buttonclicked(2),highlightbackground="gray13")
buttontwo.grid(row=4,column=1)

buttonone=Button(window,text="1",width=6,height=3,command=lambda:buttonclicked(1),highlightbackground="gray13")
buttonone.grid(row=4,column=2)

buttonzero=Button(window,text="0",width=16,height=3,command=lambda:buttonclicked(0),highlightbackground="gray13")
buttonzero.grid(row=5,columnspan=2)

buttondot=Button(window,text=".",width=6,height=3,command=lambda:dot_clicked("."),highlightbackground="gray13")
buttondot.grid(row=5,column=2)









window.mainloop()

#end