DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Lincoln MKZ DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dataspeed-can-msg-filters rospy roscpp nodelet std-msgs geometry-msgs sensor-msgs can-msgs dbw-mkz-msgs"

RDEPENDS_${PN} = "roslaunch dataspeed-can-usb dbw-mkz-description dataspeed-ulc-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_can/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "822b0387f81e2b90ab136a756cc5af7b"
SRC_URI[sha256sum] = "912edcf6f79ab86b6040b97bab30c9804b42d7694b41d4c58f2e300df70600e4"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_can-1.1.1-0"

inherit catkin
