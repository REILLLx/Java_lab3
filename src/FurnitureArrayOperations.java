import java.util.Arrays;
import java.util.Comparator;

/**
 * Основний клас для роботи з масивом об'єктів класу Furniture (Меблі).
 */
public class FurnitureArrayOperations {

    public static void main(String[] args) {
        // Оголошення та ініціалізація масиву меблів
        Furniture[] furnitureArray = {
                new Furniture("Стіл", "Метал", "Сірий", 3400.0, 20.0),
                new Furniture("Стілець", "Дерево", "Коричневий", 1200.0, 5.5),
                new Furniture("Шафа", "Дерево", "Білий", 5400.0, 50.0),
                new Furniture("Крісло", "Штучна шкіра", "Чорний", 2000.0, 12.0),
                new Furniture("Полиця", "Пластик", "Синій", 800.0, 3.0)
        };

        // Сортування масиву за ціною (price) за зростанням
        Arrays.sort(furnitureArray, Comparator.comparingDouble(Furniture::getPrice));

        // Виведення масиву після сортування за ціною
        System.out.println("Масив меблів, відсортований за ціною (зростання):");
        for (Furniture furniture : furnitureArray) {
            System.out.println(furniture);
        }

        // Сортування масиву за вагою (weight) за спаданням
        Arrays.sort(furnitureArray, Comparator.comparingDouble(Furniture::getWeight).reversed());

        // Виведення масиву після сортування за вагою
        System.out.println("\nМасив меблів, відсортований за вагою (спадання):");
        for (Furniture furniture : furnitureArray) {
            System.out.println(furniture);
        }
        // Заданий об'єкт для пошуку
        Furniture targetFurniture = new Furniture("Крісло", "Штучна шкіра", "Чорний", 2000.0, 12.0);

        // Пошук об'єкта, ідентичного заданому
        Furniture foundFurniture = findFurniture(furnitureArray, targetFurniture);

        // Результат пошуку
        if (foundFurniture != null) {
            System.out.println("Знайдений об'єкт: " + foundFurniture);
        } else {
            System.out.println("Об'єкт не знайдено.");
        }
    }

    /**
     * Знаходить об'єкт у масиві, який ідентичний заданому об'єкту.
     *
     * @param furnitureArray Масив об'єктів Furniture.
     * @param targetFurniture Об'єкт для пошуку.
     * @return Знайдений об'єкт або null, якщо об'єкт не знайдено.
     */
    public static Furniture findFurniture(Furniture[] furnitureArray, Furniture targetFurniture) {
        for (Furniture furniture : furnitureArray) {
            if (furniture.equals(targetFurniture)) {
                return furniture;
            }
        }
        return null;
    }
}
