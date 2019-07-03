DESCRIPTION = "Package to translate ROS messages to and from CAN messages to interact with the Universal Lat/Lon Controller (ULC) firmware"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy nodelet std-msgs geometry-msgs can-msgs dataspeed-ulc-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc_can/0.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4a2562dfba17dd3a3e99ad798744324"
SRC_URI[sha256sum] = "c4fc0d6aba845473c5420ee7e3625a5a8fbcdc13925ef38e17a2153c3e427dd0"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc_can-0.0.4-1"

inherit catkin
