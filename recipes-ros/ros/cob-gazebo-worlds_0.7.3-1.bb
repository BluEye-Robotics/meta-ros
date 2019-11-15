DESCRIPTION = "This package provides some worlds for gazebo simulation."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "cob-default-env-config controller-manager gazebo-msgs gazebo-ros-control gazebo-ros joint-state-controller joint-state-publisher position-controllers robot-state-publisher rospy std-msgs tf velocity-controllers xacro"

SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/melodic/cob_gazebo_worlds/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "96820c2b82c49aa5b4610e03d4149b25"
SRC_URI[sha256sum] = "cd41c3e638fac6beeda71a673028a76acfa75f6c10ddffc38b17e12d0ee851b8"

ROS_SPN = "cob_simulation"
S = "${WORKDIR}/cob_simulation-release-release-melodic-cob_gazebo_worlds-0.7.3-1"

inherit catkin
