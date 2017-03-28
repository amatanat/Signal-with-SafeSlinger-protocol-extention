// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binding<CleanPreKeysJob>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code CleanPreKeysJob} and its
 * dependencies.
 *
 * Being a {@code Provider<CleanPreKeysJob>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<CleanPreKeysJob>} and handling injection
 * of annotated fields.
 */
public final class CleanPreKeysJob$$InjectAdapter extends Binding<CleanPreKeysJob>
    implements MembersInjector<CleanPreKeysJob> {
  private Binding<org.whispersystems.textsecure.api.TextSecureAccountManager> accountManager;
  private Binding<org.thoughtcrime.securesms.dependencies.AxolotlStorageModule.SignedPreKeyStoreFactory> signedPreKeyStoreFactory;
  private Binding<MasterSecretJob> supertype;

  public CleanPreKeysJob$$InjectAdapter() {
    super(null, "members/org.thoughtcrime.securesms.jobs.CleanPreKeysJob", NOT_SINGLETON, CleanPreKeysJob.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    accountManager = (Binding<org.whispersystems.textsecure.api.TextSecureAccountManager>) linker.requestBinding("org.whispersystems.textsecure.api.TextSecureAccountManager", CleanPreKeysJob.class, getClass().getClassLoader());
    signedPreKeyStoreFactory = (Binding<org.thoughtcrime.securesms.dependencies.AxolotlStorageModule.SignedPreKeyStoreFactory>) linker.requestBinding("org.thoughtcrime.securesms.dependencies.AxolotlStorageModule$SignedPreKeyStoreFactory", CleanPreKeysJob.class, getClass().getClassLoader());
    supertype = (Binding<MasterSecretJob>) linker.requestBinding("members/org.thoughtcrime.securesms.jobs.MasterSecretJob", CleanPreKeysJob.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(accountManager);
    injectMembersBindings.add(signedPreKeyStoreFactory);
    injectMembersBindings.add(supertype);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<CleanPreKeysJob>}.
   */
  @Override
  public void injectMembers(CleanPreKeysJob object) {
    object.accountManager = accountManager.get();
    object.signedPreKeyStoreFactory = signedPreKeyStoreFactory.get();
    supertype.injectMembers(object);
  }

}