/**
 * Клас Furniture (Меблі), який представляє базову модель меблів.
 */
public class Furniture {

    // Поля класу
    private String name;           // Назва меблів
    private String material;       // Матеріал (наприклад, дерево, метал, пластик)
    private String color;          // Колір
    private double price;          // Ціна
    private double weight;         // Вага в кілограмах

    /**
     * Конструктор класу Furniture.
     *
     * @param name     Назва меблів.
     * @param material Матеріал меблів.
     * @param color    Колір меблів.
     * @param price    Ціна меблів.
     * @param weight   Вага меблів.
     */
    public Furniture(String name, String material, String color, double price, double weight) {
        this.name = name;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    /**
     * Повертає назву меблів.
     *
     * @return Назва меблів.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює назву меблів.
     *
     * @param name Назва меблів.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Повертає матеріал меблів.
     *
     * @return Матеріал меблів.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Встановлює матеріал меблів.
     *
     * @param material Матеріал меблів.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Повертає колір меблів.
     *
     * @return Колір меблів.
     */
    public String getColor() {
        return color;
    }

    /**
     * Встановлює колір меблів.
     *
     * @param color Колір меблів.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Повертає ціну меблів.
     *
     * @return Ціна меблів.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Встановлює ціну меблів.
     *
     * @param price Ціна меблів.
     */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною.");
        }
        this.price = price;
    }

    /**
     * Повертає вагу меблів.
     *
     * @return Вага меблів.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Встановлює вагу меблів.
     *
     * @param weight Вага меблів.
     */
    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Вага не може бути від'ємною.");
        }
        this.weight = weight;
    }

    /**
     * Порівнює об'єкти Furniture на рівність за їх полями.
     *
     * @param obj Об'єкт для порівняння.
     * @return true, якщо об'єкти однакові, інакше false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Furniture furniture = (Furniture) obj;
        return Double.compare(furniture.price, price) == 0 &&
                Double.compare(furniture.weight, weight) == 0 &&
                name.equals(furniture.name) &&
                material.equals(furniture.material) &&
                color.equals(furniture.color);
    }

    /**
     * Повертає текстове представлення об'єкта Furniture.
     *
     * @return Рядок із описом меблів.
     */
    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
