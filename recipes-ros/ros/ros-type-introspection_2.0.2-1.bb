DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize ROS messages which type is unknown at compilation time."
AUTHOR = "Davide Faconti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roscpp-serialization rostime roscpp roscpp-serialization rostime"

RDEPENDS_${PN} = "roscpp roscpp-serialization rostime"

SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/melodic/ros_type_introspection/2.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75773978c09acbb80691bb70201fdc95"
SRC_URI[sha256sum] = "24cfbb2a7016e118e840c842d4a492c0b2368d83c7428180ebdecf513230a720"

S = "${WORKDIR}/ros_type_introspection-release-release-melodic-ros_type_introspection-2.0.2-1"

inherit catkin
