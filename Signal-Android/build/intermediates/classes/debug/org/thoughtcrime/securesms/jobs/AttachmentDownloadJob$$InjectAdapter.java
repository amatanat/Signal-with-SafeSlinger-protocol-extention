// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binding<AttachmentDownloadJob>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code AttachmentDownloadJob} and its
 * dependencies.
 *
 * Being a {@code Provider<AttachmentDownloadJob>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<AttachmentDownloadJob>} and handling injection
 * of annotated fields.
 */
public final class AttachmentDownloadJob$$InjectAdapter extends Binding<AttachmentDownloadJob>
    implements MembersInjector<AttachmentDownloadJob> {
  private Binding<org.whispersystems.textsecure.api.TextSecureMessageReceiver> messageReceiver;
  private Binding<MasterSecretJob> supertype;

  public AttachmentDownloadJob$$InjectAdapter() {
    super(null, "members/org.thoughtcrime.securesms.jobs.AttachmentDownloadJob", NOT_SINGLETON, AttachmentDownloadJob.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    messageReceiver = (Binding<org.whispersystems.textsecure.api.TextSecureMessageReceiver>) linker.requestBinding("org.whispersystems.textsecure.api.TextSecureMessageReceiver", AttachmentDownloadJob.class, getClass().getClassLoader());
    supertype = (Binding<MasterSecretJob>) linker.requestBinding("members/org.thoughtcrime.securesms.jobs.MasterSecretJob", AttachmentDownloadJob.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(messageReceiver);
    injectMembersBindings.add(supertype);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<AttachmentDownloadJob>}.
   */
  @Override
  public void injectMembers(AttachmentDownloadJob object) {
    object.messageReceiver = messageReceiver.get();
    supertype.injectMembers(object);
  }

}
