DESCRIPTION = "Gazebo model plugin to simulate Audibot"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gazebo-ros roscpp tf"

RDEPENDS_${PN} = "robot-state-publisher gazebo-ros-pkgs"

SRC_URI = "https://github.com/robustify/audibot-release/archive/release/melodic/audibot_gazebo/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2b1d7872c79de84f805bdd83f7f5ab8f"
SRC_URI[sha256sum] = "1325a90b8357006a4558333457a3abf62096b18e0cacce3cb1ce68996f0ee0f9"

ROS_SPN = "audibot"
S = "${WORKDIR}/audibot-release-release-melodic-audibot_gazebo-0.1.0-1"

inherit catkin
