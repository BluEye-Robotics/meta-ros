DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Lincoln MKZ DBW kit"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dataspeed-can-msg-filters rospy roscpp nodelet std-msgs geometry-msgs sensor-msgs can-msgs dbw-mkz-msgs"

RDEPENDS_${PN} = "roslaunch dataspeed-can-usb dbw-mkz-description dataspeed-ulc-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_can/1.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a143303c5252eb1533d5bb222c0622a4"
SRC_URI[sha256sum] = "c9bfcc4af61c81906db7436009f9620e4db8e92397e964c85f99cfd00519ec24"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_can-1.2.3-1"

inherit catkin
