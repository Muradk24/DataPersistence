package edu.farmingdale.alrajab.bcs421.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\'J!\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0012\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0015\u001a\u00020\u0016H\'J \u0010\u0017\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0018H\'\u00a8\u0006\u0019"}, d2 = {"Ledu/farmingdale/alrajab/bcs421/database/UserDao;", "", "addUser", "", "user", "Ledu/farmingdale/alrajab/bcs421/database/User;", "delete", "", "findByName", "first", "", "last", "getAll", "", "getUser", "id", "insertAll", "users", "", "([Ledu/farmingdale/alrajab/bcs421/database/User;)V", "loadAllByIds", "userIds", "", "updateUser", "", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM users")
    public abstract java.util.List<edu.farmingdale.alrajab.bcs421.database.User> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM users WHERE uid IN (:userIds)")
    public abstract java.util.List<edu.farmingdale.alrajab.bcs421.database.User> loadAllByIds(@org.jetbrains.annotations.NotNull()
    int[] userIds);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM users WHERE first_name LIKE :first AND last_name LIKE :last LIMIT 1")
    public abstract edu.farmingdale.alrajab.bcs421.database.User findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String last);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    edu.farmingdale.alrajab.bcs421.database.User... users);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long addUser(@org.jetbrains.annotations.NotNull()
    edu.farmingdale.alrajab.bcs421.database.User user);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM users WHERE uid = :id")
    public abstract edu.farmingdale.alrajab.bcs421.database.User getUser(long id);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    edu.farmingdale.alrajab.bcs421.database.User user);
    
    @androidx.room.Query(value = "UPDATE users SET first_name = :first, last_name = :last WHERE uid =:id")
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String first, @org.jetbrains.annotations.NotNull()
    java.lang.String last, int id);
}