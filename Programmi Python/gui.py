from Tkinter import *

class MiaApp:
  def __init__(self, genitore):
    self.mioGenitore = genitore
    self.mioContenitore1 = Frame(genitore)
    self.mioContenitore1.pack()

    self.pulsante1 = Button(self.mioContenitore1)
    self.pulsante1.configure(text = "Conferma", background = "green")
    self.pulsante1.pack(side = LEFT)
    self.pulsante1.focus_force()  ### (0)
    self.pulsante1.bind("<Button-1>", self.pulsante1Premuto)
    self.pulsante1.bind("<Return>", self.pulsante1Premuto)  ### (1)

    self.pulsante2 = Button(self.mioContenitore1)
    self.pulsante2.configure(text = "Annulla", background = "red")
    self.pulsante2.pack(side = RIGHT)
    self.pulsante2.bind("<Button-1>", self.pulsante2Premuto)
    self.pulsante2.bind("<Return>", self.pulsante2Premuto)  ### (2)

  def pulsante1Premuto(self, evento):
    descrivi_evento(evento)  ### (3)
    if self.pulsante1["background"] == "green":
      self.pulsante1["background"] = "yellow"
    else:
      self.pulsante1["background"] = "green"

  def pulsante2Premuto(self, evento):
    descrivi_evento(evento)  ### (4)
    self.mioGenitore.destroy()

def descrivi_evento(evento):  ### (5)
  """Scrive una descrizione dell'evento, in base ai suoi attributi
  """
  nome_evento = {"2": "Pressione tasto tastiera",
                 "4": "Pressione pulsante GUI"}
  print "Tempo:", str(evento.time)  ### (6)
  print "Tipo di evento: " + str(evento.type),\
    "(" + nome_evento[str(evento.type)] + ")",\
    "-- Id. widget collegato a evento: " + str(evento.widget),\
    "-- Simbolo tasto collegato a evento: " + str(evento.keysym)


radice = Tk()
miaApp = MiaApp(radice)
radice.mainloop()
