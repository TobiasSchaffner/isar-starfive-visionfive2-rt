#
# Copyright (c) Siemens AG, 2023
#
# Authors:
#  Tobias Schaffner <tobias.schaffner@siemens.com>
#
# SPDX-License-Identifier: MIT

require recipes-core/images/isar-image-base.bb
IMAGE_INSTALL += "customizations"

# Common tooling
IMAGE_PREINSTALL += "vim openssh-server"

# Realtime tooling
IMAGE_PREINSTALL += "rt-tests jitterdebugger stress-ng"

# OSADL test image requirements
IMAGE_PREINSTALL += "\
    bc \
    bison \
    flex \
    gcc \
    gpm \
    libelf-dev \
    libncurses5-dev \
    libnet-dns-perl \
    libnuma-dev \
    libssl-dev \
    make \
    munin-node \
    munin-node \
    nasm \
    netpbm \
    ntp \
    rsync \
    rsyslog \
    snmp"
