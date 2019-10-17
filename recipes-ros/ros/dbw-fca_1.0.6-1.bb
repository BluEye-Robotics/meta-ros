DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Chrysler Pacifica DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "dbw-fca-can dbw-fca-description dbw-fca-joystick-demo dbw-fca-msgs"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca/1.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19e51d1c3e1cba045b7843bc049f61eb"
SRC_URI[sha256sum] = "688c0c01e19c4499df112a404081a453bf81aab02905c4b567d7b3d0968be36a"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca-1.0.6-1"

inherit catkin
