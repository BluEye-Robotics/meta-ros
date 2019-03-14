DESCRIPTION = "Gazebo models and runtime configuration for igvc_self_drive simulator"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6c4b0dfc2c040991f7798d2c24b8fc03"

DEPENDS = ""

RDEPENDS_${PN} = "robot-state-publisher gazebo-ros"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_gazebo/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ceb7de4d1591679a5ae2d421b66de108"
SRC_URI[sha256sum] = "8b83406423a8bcc6de599c32df446a7165145353418a9c5e279c43a0b9f08e4e"

ROS_SPN = "igvc_self_drive_sim"
S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_gazebo-0.1.4-1"

inherit catkin
