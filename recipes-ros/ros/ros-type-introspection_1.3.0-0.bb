DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize ROS messages which type is unknown at compilation time."
AUTHOR = "Davide Faconti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roscpp-serialization rostime abseil-cpp roscpp roscpp-serialization rostime abseil-cpp"

RDEPENDS_${PN} = "roscpp roscpp-serialization rostime abseil-cpp"

SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/melodic/ros_type_introspection/1.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cdc1c3ae4dba5979a052e49ed44c9ee1"
SRC_URI[sha256sum] = "dd4a65f0facf184daca9db53fb4199071a366ca7f939d147796d9ad0fd0dcbb4"

S = "${WORKDIR}/ros_type_introspection-release-release-melodic-ros_type_introspection-1.3.0-0"

inherit catkin
