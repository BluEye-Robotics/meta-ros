DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Lincoln MKZ DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dbw-mkz-can dbw-mkz-description dbw-mkz-joystick-demo dbw-mkz-msgs"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7ce68ffb8c74ff4e29f88036bba57dc"
SRC_URI[sha256sum] = "a4531c8d8bbdb6ef3afffc027dd8399aa74cebe90ff43153b1197b45e447ef4d"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz-1.1.1-0"

inherit catkin
