DESCRIPTION = "A ROS driver for the SICK TiM and SICK MRS series of laser scanners. This package is based on the original sick_tim-repository of Martin Günther et al."
AUTHOR = "Michael Lehning"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs visualization-msgs diagnostic-updater dynamic-reconfigure message-generation pcl-conversions pcl-ros roscpp sensor-msgs diagnostic-updater dynamic-reconfigure message-runtime pcl-conversions pcl-ros visualization-msgs"

RDEPENDS_${PN} = "roscpp sensor-msgs diagnostic-updater dynamic-reconfigure message-runtime pcl-conversions pcl-ros visualization-msgs"

SRC_URI = "https://github.com/SICKAG/sick_scan-release/archive/release/melodic/sick_scan/0.0.16-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b0703ab09cd9d4c90020acbef85dd09b"
SRC_URI[sha256sum] = "d0c506df63940a7cbee85eb4c56ab229459315184e65e6fa3f9f4aa827fe324a"

S = "${WORKDIR}/sick_scan-release-release-melodic-sick_scan-0.0.16-0"

inherit catkin
