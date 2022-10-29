package edu.farmingdale.alrajab.bcs421.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ledu/farmingdale/alrajab/bcs421/database/NameRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Ledu/farmingdale/alrajab/bcs421/database/AppDatabase;", "usrDao", "Ledu/farmingdale/alrajab/bcs421/database/UserDao;", "addUser", "", "usr", "Ledu/farmingdale/alrajab/bcs421/database/User;", "deleteUser", "getAll", "", "getUser", "id", "", "updateUser", "Companion", "app_debug"})
public final class NameRepository {
    private final edu.farmingdale.alrajab.bcs421.database.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    public static final edu.farmingdale.alrajab.bcs421.database.NameRepository.Companion Companion = null;
    private static edu.farmingdale.alrajab.bcs421.database.NameRepository instance;
    private final edu.farmingdale.alrajab.bcs421.database.UserDao usrDao = null;
    
    private NameRepository(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final edu.farmingdale.alrajab.bcs421.database.User getUser(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<edu.farmingdale.alrajab.bcs421.database.User> getAll() {
        return null;
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    edu.farmingdale.alrajab.bcs421.database.User usr) {
    }
    
    public final void deleteUser(@org.jetbrains.annotations.NotNull()
    edu.farmingdale.alrajab.bcs421.database.User usr) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    edu.farmingdale.alrajab.bcs421.database.User usr) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ledu/farmingdale/alrajab/bcs421/database/NameRepository$Companion;", "", "()V", "instance", "Ledu/farmingdale/alrajab/bcs421/database/NameRepository;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.farmingdale.alrajab.bcs421.database.NameRepository getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}