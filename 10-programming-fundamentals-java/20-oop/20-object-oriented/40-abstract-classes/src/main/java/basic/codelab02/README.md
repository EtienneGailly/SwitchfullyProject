# Shoot the enemy

Create a `Weapon` class, as its state it has an `amount of damage` it deals when hitting an enemy.
There a different types of weapons:
- Ballistic weapons
    - which have 10 as their amount of damage
- Energy weapons
    - which have 20 as their amount of damage
- Melee weapons
    - which have 8 as their amount of damage

Store all the weapon classes in the same **package**.

Every weapon should have a `void dealDamageTo(Enemy enemy)` method, it should be defined on the level of `Weapon`, but **abstract**.

The different weapons have a different implementation for `dealDamageTo`:
- Ballistic weapons hurt the enemy (calls `enemyToAttack.hurt(amountOfDamage)`)
- Energy weapons stun the enemy (calls `enemyToAttack.stun(amountOfDamage)`)
- Melee weapons stab the enemy (calls `enemyToAttack.stab(amountOfDamage)`)

You're free to implement `Enemy` and its method however you want.






