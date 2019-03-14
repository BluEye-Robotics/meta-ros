DESCRIPTION = "Package to parse NMEA strings and publish a very simple GPS message. Does not require or use the GPSD deamon."
AUTHOR = "Eric Perko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy python-pyserial geometry-msgs nmea-msgs sensor-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/nmea_navsat_driver-release/archive/release/melodic/nmea_navsat_driver/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e986e81acb1c44754a858491ed308f1f"
SRC_URI[sha256sum] = "c502e261f11dee9d169b96c13eec505a7251157364aeac7201a6518740559557"

S = "${WORKDIR}/nmea_navsat_driver-release-release-melodic-nmea_navsat_driver-0.5.1-0"

inherit catkin
