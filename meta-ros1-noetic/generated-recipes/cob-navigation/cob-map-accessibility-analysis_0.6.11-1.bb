# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "cob_map_accessibility_analysis receives the map from navigation as well as obstacles and inflates_obstacles topics to assemble a common obstacle map. Upon request, this node checks the accessibility of poses within thin map by (i) checking whether the pose itself is free and by (ii) checking whether there is a closed path from robot to the goal pose."
AUTHOR = "Richard Bormann <richard.bormann@ipa.fraunhofer.de>"
ROS_AUTHOR = "Richard Bormann <richard.bormann@ipa.fraunhofer.de>"
HOMEPAGE = "http://ros.org/wiki/cob_map_accessibility_analysis"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_navigation"
ROS_BPN = "cob_map_accessibility_analysis"

ROS_BUILD_DEPENDS = " \
    boost \
    cob-3d-mapping-msgs \
    cv-bridge \
    geometry-msgs \
    image-transport \
    message-filters \
    message-generation \
    nav-msgs \
    opencv \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cob-3d-mapping-msgs \
    cv-bridge \
    geometry-msgs \
    image-transport \
    message-filters \
    nav-msgs \
    opencv \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cob-3d-mapping-msgs \
    cv-bridge \
    geometry-msgs \
    image-transport \
    message-filters \
    message-runtime \
    nav-msgs \
    opencv \
    pcl \
    pcl-ros \
    roscpp \
    rospy \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_navigation-release/archive/release/noetic/cob_map_accessibility_analysis/0.6.11-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_map_accessibility_analysis"
SRC_URI = "git://github.com/ipa320/cob_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "488eb9e7cbc90fb87706552e8e5c5717c4243c53"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
