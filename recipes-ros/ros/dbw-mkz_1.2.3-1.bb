DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Lincoln MKZ DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dbw-mkz-can dbw-mkz-description dbw-mkz-joystick-demo dbw-mkz-msgs"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz/1.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7eadea69ab59aa213553994d9c05fab6"
SRC_URI[sha256sum] = "dd8b1ff2c326f66b1106449e1ae429badff6740c2d744c88d653092fa58f7aa3"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz-1.2.3-1"

inherit catkin
