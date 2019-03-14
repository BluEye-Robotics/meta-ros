DESCRIPTION = "hector_components_description contains URDF xacro macros for robot components, so they are easily attachable to robot models."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "xacro hector-sensors-description hector-xacro-tools"

RDEPENDS_${PN} = "xacro hector-sensors-description hector-xacro-tools"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/melodic/hector_components_description/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5b83d23247b1b331c2e0ac2180b4d0c"
SRC_URI[sha256sum] = "b3626eafa575c9d792d9a92beefb7b588076ebdafaec15c168268b60a1890053"

ROS_SPN = "hector_models"
S = "${WORKDIR}/hector_models-release-release-melodic-hector_components_description-0.5.0-0"

inherit catkin
