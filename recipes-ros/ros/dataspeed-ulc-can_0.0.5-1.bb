DESCRIPTION = "Package to translate ROS messages to and from CAN messages to interact with the Universal Lat/Lon Controller (ULC) firmware"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy nodelet std-msgs geometry-msgs can-msgs dataspeed-ulc-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_ulc_ros-release/archive/release/melodic/dataspeed_ulc_can/0.0.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f4673fbad60a3855725bfbe20c44c54b"
SRC_URI[sha256sum] = "df805e7fffff44a12238fba6da27ca114035d1216e8e7e718beefec2475ac44b"

ROS_SPN = "dataspeed_ulc_ros"
S = "${WORKDIR}/dataspeed_ulc_ros-release-release-melodic-dataspeed_ulc_can-0.0.5-1"

inherit catkin
