Аннотация @Bean

1.Позволяет полностью контролировать создание экземпляра (в методе)
2.Позволяет добавлять в контекст несколько экземпляров одного типа (в последствии выбор либо по имени бина, которое определяется в аннотации @Bean(name = "beanName") либо по приоритету благодаря аннотации @Primary)
3.Позволяет добавлять в контекст бины любого типа, в т.ч. классов оберток

Аннотация @Component

1.Экземпляр создается автоматичеки, косвенный контроль осуществляется через методы с аннотациями @PostConstruct и @PreDestroy
2.Невозможно добавлять в контекст несколько экземпляров одного типа
3.Позволяет добавлять в контекст бины только классов приложения, бины типа классов оберток недосупны