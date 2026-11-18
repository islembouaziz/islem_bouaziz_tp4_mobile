

##  Structure et Fonctionnalités

Le projet est composé de deux activités principales :

### 1. Première Activité (`MainActivity`)
- **Interface graphique (`activity_main.xml`)** : Un formulaire vertical comprenant :
  - Trois champs de saisie (`EditText`) précédés de leurs étiquettes (`TextView`) pour le **Nom**, le **Prénom** et l'**Email**.
  - Un bouton de validation (`Button`) avec le texte **« ENVOYER »**.
- **Logique Java (`MainActivity.java`)** :
  - Récupération des valeurs saisies dans les champs.
  - Instanciation d'un `Intent` explicite ciblant `WelcomeActivity`.
  - Ajout des données en tant qu'extras (`name`, `lastname`, `mymail`).
  - Démarrage de la seconde activité avec `startActivity()`.

#### Captures d'écran — Première Activité

| Interface de Saisie (Activité 1) |
| :---: |
| ![Activité 1](app/capture/activite1.png) |

#### Code Source — `MainActivity.java`

| MainActivity - Partie 1 | MainActivity - Partie 2 |
| :---: | :---: |
| ![Code MainActivity 1](app/capture/mainactivityjava1.png) | ![Code MainActivity 2](app/capture/mainactivityjava2.png) |

---

### 2. Deuxième Activité (`WelcomeActivity`)
- **Interface graphique (`welcom_activity.xml`)** :
  - Un conteneur `LinearLayout` centré.
  - Un `TextView` affichant sous forme de paragraphe les informations transférées.
- **Logique Java (`WelcomeActivity.java`)** :
  - Récupération des extras transmis par l'Intent (`getIntent().getExtras()`).
  - Formatage et affichage du message de bienvenue :
    ```
    Bienvenue [Nom] [Prénom],
    C'est la deuxième activité.
    Vous serez bientôt contacté sur : [Email]
    ```

#### Captures d'écran — Deuxième Activité

| Affichage du Résultat (Activité 2) |
| :---: |
| ![Activité 2](app/capture/activite2.png) |

#### Code Source — `WelcomeActivity.java`

| WelcomeActivity - Partie 1 | WelcomeActivity - Partie 2 |
| :---: | :---: |
| ![Code WelcomeActivity 1](app/capture/welcomeactivityjava1.png) | ![Code WelcomeActivity 2](app/capture/welcomeactivityjava2.png) |


