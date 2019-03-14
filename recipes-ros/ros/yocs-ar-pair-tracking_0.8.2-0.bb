DESCRIPTION = "The AR pair tracking package"
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs geometry-msgs sensor-msgs yocs-math-toolkit ar-track-alvar-msgs yocs-ar-marker-tracking yocs-msgs roscpp std-msgs geometry-msgs sensor-msgs yocs-math-toolkit ar-track-alvar-msgs yocs-ar-marker-tracking yocs-msgs"

RDEPENDS_${PN} = "roscpp std-msgs geometry-msgs sensor-msgs yocs-math-toolkit ar-track-alvar-msgs yocs-ar-marker-tracking yocs-msgs"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_ar_pair_tracking/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c677d086aa864828adc5483fe7b68a3a"
SRC_URI[sha256sum] = "60179e49a3644effdd14bf503e183c3ef7c0690f550b89e64847399f3934c7df"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_ar_pair_tracking-0.8.2-0"

inherit catkin
