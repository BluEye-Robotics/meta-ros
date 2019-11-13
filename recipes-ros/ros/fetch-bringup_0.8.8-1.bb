DESCRIPTION = "Bringup for fetch"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = ""

RDEPENDS_${PN} = "depth-image-proc diagnostic-aggregator fetch-description fetch-drivers fetch-moveit-config fetch-navigation fetch-open-auto-dock fetch-teleop graft image-proc joy openni2-launch ps3joy robot-state-publisher sensor-msgs sick-tim"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/fetch_bringup/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "63dacfa82b19868ca443a3690e9bd9b8"
SRC_URI[sha256sum] = "d2cc0bed589bf30ce12f119f1970ae8523af35977276098724b3c508bda9bc3a"

ROS_SPN = "fetch_robots"
S = "${WORKDIR}/fetch_robots-release-release-melodic-fetch_bringup-0.8.8-1"

inherit catkin
