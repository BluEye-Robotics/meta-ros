DESCRIPTION = "Bringup for fetch"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = ""

RDEPENDS_${PN} = "depth-image-proc diagnostic-aggregator fetch-description fetch-drivers fetch-moveit-config fetch-navigation fetch-open-auto-dock fetch-teleop graft image-proc joy openni2-launch ps3joy robot-state-publisher sensor-msgs sick-tim"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/fetch_bringup/0.8.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5f10c5b5be321a6659c80f0cab38fee1"
SRC_URI[sha256sum] = "7226d4b1fd3e2bb93192fa270d0d1a82cabd74c3dbdbada0cf5620e5ae3c07de"

ROS_SPN = "fetch_robots"
S = "${WORKDIR}/fetch_robots-release-release-melodic-fetch_bringup-0.8.6-0"

inherit catkin
