/*
Vediamo all'opera la concorrenza:
*crea 10 thread
*ogni theard si presenta in un ciclo infinito
*/
class SimpleRunnable2 extends Thread{
public void run() {
while (true){
System.out.println("in thread named '"
+ Thread.currentThread().getName() + "'");
yield();
}
}
}
public class ThreadTester2 {
public static void main(String argv[]) {
for (int i = 0; i < 10; i++) {
SimpleRunnable2 aSR = new SimpleRunnable2();
System.out.println("new Thread() " + (aSR == null ?
"fail" : "succeed") + "ed.");
aSR.start();
/*
Se non commento il try/catch, il main deve aspettare che il Thread-0 termini la sua esecuzione.
Questo non accade mai perché il main dice di aspettare che termini il thread corrente che non
termina mai perché ha un ciclo infinito.
*/
try { aSR.join(); } catch (InterruptedException ignored) { }
}
while (true){System.out.println("Io sono il main"); }
}
}

