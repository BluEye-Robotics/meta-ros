DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize ROS messages which type is unknown at compilation time."
AUTHOR = "Davide Faconti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roscpp-serialization rostime abseil-cpp roscpp roscpp-serialization rostime abseil-cpp"

RDEPENDS_${PN} = "roscpp roscpp-serialization rostime abseil-cpp"

SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/melodic/ros_type_introspection/1.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c55f8ff69d934ab204e5fd1948285324"
SRC_URI[sha256sum] = "95cc396b2deeddef4a447980088c3a45ebaf58b5200417d9c7c9b0ff96c77e19"

S = "${WORKDIR}/ros_type_introspection-release-release-melodic-ros_type_introspection-1.3.3-1"

inherit catkin
