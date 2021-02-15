# Every ROS recipe, generated or not, must contain "inherit ros_distro_${ROS_DISTRO}".
#
# Copyright (c) 2020 LG Electronics, Inc.

ROS_DISTRO = "noetic"

inherit ${ROS_DISTRO_TYPE}_distro

# HACK until "python-qt-binding" builds
ROS_EXEC_DEPENDS_remove = "python-qt-binding"

do_install_append_class-target() {
    sed -i 's@#!${STAGING_BINDIR_NATIVE}/python3-native/python3@#!/usr/bin/env python3@g' ${D}${ros_bindir}/* | true
}
