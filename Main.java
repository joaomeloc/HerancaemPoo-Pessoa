public class Main {
    public static void main(String[] args) {
        // Teste da classe Fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "Rua A, 123", "123456789", 5000, 2000);
        System.out.println("=== Informações do Fornecedor ===");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());

        // Teste da classe Administrador
        Administrador administrador = new Administrador("Administrador B", "Rua B, 456", "987654321", 1, 3000, 10, 500);
        System.out.println("\n=== Informações do Administrador ===");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do setor: " + administrador.getCodigoSetor());
        System.out.println("Salário do administrador: " + administrador.calcularSalario());

        // Teste da classe Operario
        Operario operario = new Operario("Operário C", "Rua C, 789", "456789123", 2, 2000, 5, 10000, 2);
        System.out.println("\n=== Informações do Operário ===");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do setor: " + operario.getCodigoSetor());
        System.out.println("Salário do operário: " + operario.calcularSalario());

        // Teste da classe Vendedor
        Vendedor vendedor = new Vendedor("Vendedor D", "Rua D, 987", "321654987", 3, 1500, 3, 20000, 3);
        System.out.println("\n=== Informações do Vendedor ===");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
    }
}

