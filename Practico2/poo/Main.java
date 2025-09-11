public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Pair
        Pair p = new Pair(5, 6);
        System.out.println("p Fst: " + p.getFst());
        System.out.println("p Snd: " + p.getSnd());

        // Creación de un objeto MemoryPair
        MemoryPair mp = new MemoryPair(3, 4);
        mp.setFst(10); // Guarda 3 como previousFst
        mp.setSnd(10); // Guarda 4 como previousSnd

        System.out.println("mp Fst: " + mp.getFst()); // 10
        System.out.println("mp Snd: " + mp.getSnd()); // 10

        // Recuperar los valores anteriores
        mp.recover(); // Debe volver a 3 y 4

        System.out.println("mp Fst: " + mp.getFst()); // 3
        System.out.println("mp Snd: " + mp.getSnd()); // 4

        // Polimorfismo: un objeto MemoryPair puede referenciarse como Pair
        p = mp; // ✅ Correcto: mp es un Pair

        // mp = p; ❌ Incorrecto: no se puede asignar un Pair a un MemoryPair directamente
    }
}

