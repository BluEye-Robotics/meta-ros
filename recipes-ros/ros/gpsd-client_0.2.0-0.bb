DESCRIPTION = "connects to a GPSd server and broadcasts GPS fixes using the NavSatFix message"
AUTHOR = "Ken Tossell"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp gps-common sensor-msgs pkgconfig libgps"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gpsd_client/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "409e5ac0d05cf08100955875f2598fde"
SRC_URI[sha256sum] = "fb72a43064b023d7be47f00194232ca28d92aea68d92e7b32d337bbe6cfda51c"

ROS_SPN = "gps_umd"
S = "${WORKDIR}/gps_umd-release-release-melodic-gpsd_client-0.2.0-0"

inherit catkin
