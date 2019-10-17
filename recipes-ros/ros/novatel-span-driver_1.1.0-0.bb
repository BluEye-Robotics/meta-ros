DESCRIPTION = "Python driver for NovAtel SPAN devices."
AUTHOR = "NovAtel Support"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch roslint rostest diagnostic-msgs diagnostic-updater geodesy novatel-msgs python3-pyserial rospy sensor-msgs std-msgs tf"

RDEPENDS_${PN} = "diagnostic-msgs diagnostic-updater geodesy novatel-msgs python3-pyserial rospy sensor-msgs std-msgs tf"

SRC_URI = "https://github.com/ros-drivers-gbp/novatel_span_driver-release/archive/release/melodic/novatel_span_driver/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75dd64e3b714d46f80363aa48252af4c"
SRC_URI[sha256sum] = "68e928f3c9728ff536bc7ea6ea1a06a4b79f30b65746bf9e112d40903dddd0ba"

S = "${WORKDIR}/novatel_span_driver-release-release-melodic-novatel_span_driver-1.1.0-0"

inherit catkin
