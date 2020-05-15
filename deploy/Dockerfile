from jenkins/jenkins

# Distributed Builds plugins
RUN /usr/local/bin/install-plugins.sh ssh-slaves

# Artifacts
RUN /usr/local/bin/install-plugins.sh htmlpublisher

# UI
RUN /usr/local/bin/install-plugins.sh greenballs
RUN /usr/local/bin/install-plugins.sh simple-theme-plugin

# Scaling
RUN /usr/local/bin/install-plugins.sh kubernetes

RUN /usr/local/bin/install-plugins.sh pipeline-aggregator-view
RUN /usr/local/bin/install-plugins.sh pipeline-stage-view
RUN /usr/local/bin/install-plugins.sh blueocean
# install Maven
USER root
RUN apt-get update && apt-get install -y maven
USER jenkins