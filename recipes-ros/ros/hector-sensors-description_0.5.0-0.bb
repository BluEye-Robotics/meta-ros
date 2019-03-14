DESCRIPTION = "hector_sensors_description contains URDF xacro macros for sensors, so they are easily attachable to robot models and usable in gazebo."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "xacro"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/melodic/hector_sensors_description/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8fde1a85996245082a0c5b8af8335be5"
SRC_URI[sha256sum] = "622a110133e72bcaaffeb45ed9eed1fd4f7f24eaabebd9e52442dc7c81d194f0"

ROS_SPN = "hector_models"
S = "${WORKDIR}/hector_models-release-release-melodic-hector_sensors_description-0.5.0-0"

inherit catkin
