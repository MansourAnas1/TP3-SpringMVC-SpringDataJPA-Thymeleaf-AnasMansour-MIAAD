### Ce projet une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. ###

## Auteur : Anas Mansour 
## Année universitaire : 2023-2024
## Master MIAAD 

## L'application doit permettre les fonctionnalités suivantes :
• Afficher les patients
• Faire la pagination


<img width="911" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/ce1c0f3b-ef99-4dcf-80aa-8cdec172aff3">

• Chercher les patients :
<img width="909" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/62ad324c-1e07-4c2f-be98-9e7baed1bae9">



# Supprimer ou modifier un  patient pour selument si utilisateur est un Admin  :

<img width="899" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/a6f5cd8f-5ab4-4b35-8822-e0d1ea1f7fb3">


# Formulaire pour ajouter un patient aussi selument si utilisateur est un Admin  :

<img width="926" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/13d4c654-045b-40a8-86b8-d7310bae0442">

-utilisateur est bien ajouter par admin :

<img width="913" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/8c459b07-6538-45a1-8e9b-3fc8427cdca3">

## Sécurité avec Spring security  :

-Login Page : 

<img width="922" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/0cd7d675-617f-4ffd-9c00-44fc1b8dfdd2">

-si un user pas un Admin essaie de supprimer ou modifier  un patient ou bien faire des actions d'admin  :

<img width="921" alt="image" src="https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/93e58df6-0b00-41ed-bc6f-1a6ac19d5dcc">

## JDBC Authentication  :
# Application properties :
![application properties](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/bf359c99-b70c-4741-add7-3c67657ca5b9)

# command Line Runner :
![commandLineRunner](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/73102ff4-b31d-41a4-8019-c5d50012e6e1)

# schema SQL :
![schema sql](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/9b7644e6-0267-415b-839c-39f83e142eb2)

# Table authorities :
![Table authorities](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/27206894-443a-4ac1-aac0-087f02b0f95c)

# Table User :
![Table User](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/5cafd628-500f-43fb-8b35-4983b98c0204)

## Le Test :
![Test d'authentifications](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/2b065736-2013-448d-8e46-840af5ccc927)

![Screenshot 2024-05-02 123230](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/89a94a92-da14-4c37-9f4c-9edd4e80135f)



## UserDetails Service :
# App User : 
![AppUser](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/5b3a170a-498b-49d0-9ab2-421c00f25d87)

# App Role :
![AppRole](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/95885b55-c6ab-41ad-89c8-a17b4d9e2b57)

# command Line Runner User Details :
![commandLineRunnerUserDetails](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/0b856a90-d9de-46d0-9810-35006ddb56fc)

# User Details Service Impl :
![UserDetailsServiceImpl](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/d8cdaec4-4512-40c9-9edc-ad6b15fa6069)

# Table app User :
![Table app_user](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/c817f3fe-c155-4387-979e-b3c327b66851)

# Table app User Role :
![Table app_user_roles](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/b6a9c813-90b7-4767-bc7a-7de6acc1343b)

# Tester sur user 1 :
![tester sur user 1](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/0c33216e-708c-469c-a92e-aee7c685c4ed)


# Ajouter le role Admin a user 1 :
![ajouter le role admin a user1](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/8dbb120e-5f4f-45cf-9d64-20c65b4d0807)

# le role est bien ajoute :
![le rolle est bien ajouter](https://github.com/MansourAnas1/TP3-SpringMVC-SpringDataJPA-Thymeleaf-AnasMansour-MIAAD/assets/167020036/1be42122-6a24-4f06-9bcc-b20e65770566)




