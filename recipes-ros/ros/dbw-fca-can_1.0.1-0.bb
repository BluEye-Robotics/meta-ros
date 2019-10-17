DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Chrysler Pacifica DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy roscpp nodelet std-msgs geometry-msgs sensor-msgs can-msgs dbw-fca-msgs"

RDEPENDS_${PN} = "roslaunch dataspeed-can-usb dbw-fca-description dataspeed-ulc-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_can/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "48507d163097db0bde2f725ec17d5288"
SRC_URI[sha256sum] = "6551ac4ef59f8aa4a27cc762f1ba9dba24a9f61f28cf8f49b53496d95b2eee91"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_can-1.0.1-0"

inherit catkin
