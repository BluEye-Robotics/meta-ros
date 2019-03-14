DESCRIPTION = "The tuw_object_msgs package. This pkg provides a set of messages used to detect, map and track objects of different types."
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs geometry-msgs message-generation"

RDEPENDS_${PN} = "std-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_object_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b5b1c652eb5d7b104c651e27edc7cc3"
SRC_URI[sha256sum] = "cd872b1996ab016b75719c00f199bef95322fabf5efc964a169a6dd362fdec8f"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_object_msgs-0.0.13-0"

inherit catkin
