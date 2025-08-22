This repository contains a collection of Core Spring projects built for practice and learning purposes. 
Each project demonstrates key concepts of the Spring Framework, including dependency injection (DI), inversion of control (IoC), bean lifecycle, autowiring, and integration with databases.

🚀 Features

Spring Core Concepts

Inversion of Control (IoC)

Dependency Injection (Constructor & Setter based)

Bean Scopes and Lifecycle (init/destroy methods)

Autowiring & Qualifiers

Spring with Annotations

@Component, @Autowired, @Qualifier

@Configuration, @Bean

Spring with XML Configuration

Bean definitions using applicationContext.xml

Mixing XML + Annotation-based configuration

Database Integration (Optional)

JDBC Template usage

Basic CRUD operations

🛠️ Tech Stack

Language: Java 8/11/17

Framework: Spring Framework (Core)

Build Tool: Maven 

Database (if applicable): MySQL / Oracle / H2

IDE: IntelliJ IDEA / Eclipse / VS Code

📂 Project Structure
core-spring-projects/
│-- project-1/  
│-- project-2/   
│-- project-3/  
│-- project-4/   
│-- README.md
│-- pom.xml / build.gradle

⚡ Getting Started

Clone the repository

git clone https://github.com/your-username/core-spring-projects.git
cd core-spring-projects


Import into IDE

Open your IDE (IntelliJ / Eclipse)

Import as Maven Project

Run the Project

Locate the MainApp.java file inside each project folder.

Run the application directly from IDE.

Database Setup (If project uses DB)

Update application.properties or applicationContext.xml with your DB credentials.

Run the SQL script (if provided) before executing CRUD operations.

📖 Example
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Student student = context.getBean("student", Student.class);
student.displayInfo();

🤝 Contribution

Contributions, issues, and feature requests are welcome!
Feel free to fork this repo and submit a pull request.
