DESCRIPTION = "GPS messages and common routines for use in GPS drivers"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-filters message-generation nav-msgs roscpp sensor-msgs std-msgs rospy message-filters message-runtime nav-msgs roscpp sensor-msgs std-msgs rospy"

RDEPENDS_${PN} = "message-filters message-runtime nav-msgs roscpp sensor-msgs std-msgs rospy"

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gps_common/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "78d81a3a4041fdb99eae539904c1f19d"
SRC_URI[sha256sum] = "ff84f3a082027035d2363ffcda76b01b2ac06432da53ccc6ee73898d3c502a03"

ROS_SPN = "gps_umd"
S = "${WORKDIR}/gps_umd-release-release-melodic-gps_common-0.2.0-0"

inherit catkin
