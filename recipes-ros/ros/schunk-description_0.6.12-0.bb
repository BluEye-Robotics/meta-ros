DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of different schunk components. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros xacro"

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_description/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fef728147b6f74e5f589513aee10d8c4"
SRC_URI[sha256sum] = "e8b387455b278c049357886b457c7016a4b79ba90cf0b83b5382813a17505d62"

ROS_SPN = "schunk_modular_robotics"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_description-0.6.12-0"

inherit catkin
