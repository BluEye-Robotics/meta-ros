DESCRIPTION = "connects to a GPSd server and broadcasts GPS fixes using the NavSatFix message"
AUTHOR = "Ken Tossell"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp gps-common sensor-msgs pkgconfig libgps"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gpsd_client/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "24f8cedfa99e2456464f403e8b15ba39"
SRC_URI[sha256sum] = "bbae3bbace5084c2fdc76a9420b18f3e32211eb823e5f02c3122ad99f4f1fd27"

ROS_SPN = "gps_umd"
S = "${WORKDIR}/gps_umd-release-release-melodic-gpsd_client-0.3.0-1"

inherit catkin
