DESCRIPTION = "Gazebo plugins for IGVC Self-Drive simulator"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=6c4b0dfc2c040991f7798d2c24b8fc03"

DEPENDS = "roscpp gazebo-ros dynamic-reconfigure"

RDEPENDS_${PN} = "robot-state-publisher hector-gazebo-plugins hector-models gazebo-ros-pkgs"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_gazebo_plugins/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0454dcd78785eb5e1c29b7f1da50e8fe"
SRC_URI[sha256sum] = "b05458848d4831c3a1dda0396285a2380bca48743fd980319fcacd645e1c26bd"

ROS_SPN = "igvc_self_drive_sim"
S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_gazebo_plugins-0.1.4-1"

inherit catkin
