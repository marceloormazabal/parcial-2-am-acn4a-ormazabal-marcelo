package com.example.knifehub;

import java.util.ArrayList;
import java.util.List;

public class KnifeData {

    public static List<Knife> getCuchillos() {
        List<Knife> lista = new ArrayList<>();

        lista.add(new Knife(
                "Cuchillo Táctico",
                "Ideal para supervivencia y camping.",
                "Este cuchillo táctico está diseñado para situaciones extremas. Incluye una hoja robusta, mango antideslizante, funda rígida, pedernal, silbato y herramientas adicionales. Es ideal para campamentos, rescate, actividades outdoor y supervivencia.",
                R.drawable.supervivencia
        ));

        lista.add(new Knife(
                "Cuchillo de Cocina",
                "Perfecto para cortes precisos.",
                "Un cuchillo profesional de cocina fabricado en acero inoxidable de alta calidad. Su hoja alveolada reduce la fricción y evita que los alimentos se adhieran, permitiendo cortes más limpios y precisos.",
                R.drawable.cocina
        ));

        lista.add(new Knife(
                "Cuchillo Criollo",
                "Clásico argentino, resistente y versátil.",
                "El tradicional cuchillo criollo argentino. Cuenta con una hoja larga y resistente, ideal para asados, faena ligera y tareas rurales. Su mango de asta proporciona un agarre firme y una estética única.",
                R.drawable.criollo
        ));

        lista.add(new Knife(
                "Navaja Multiusos",
                "Incluye varias herramientas integradas.",
                "Una navaja compacta y funcional, perfecta para camping y uso diario. Incluye hoja corta afilada, funda, clip de sujeción y diseño ergonómico que asegura comodidad y seguridad al utilizarla.",
                R.drawable.multiusos
        ));

        return lista;
    }
}
