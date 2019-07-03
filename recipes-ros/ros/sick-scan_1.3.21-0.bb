DESCRIPTION = "A ROS driver for the SICK TiM and SICK MRS series of laser scanners. This package is based on the original sick_tim-repository of Martin Günther et al."
AUTHOR = "Michael Lehning"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs visualization-msgs diagnostic-updater dynamic-reconfigure message-generation pcl-conversions pcl-ros roscpp sensor-msgs diagnostic-updater dynamic-reconfigure message-runtime pcl-conversions pcl-ros visualization-msgs"

RDEPENDS_${PN} = "roscpp sensor-msgs diagnostic-updater dynamic-reconfigure message-runtime pcl-conversions pcl-ros visualization-msgs"

SRC_URI = "https://github.com/SICKAG/sick_scan-release/archive/release/melodic/sick_scan/1.3.21-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1cebfd27ef2be2ed81977c7389ce9d2a"
SRC_URI[sha256sum] = "dce691bd294f3051310108f8e5f90b2ecfc6d287f2b86fdfbbbded89f18d68eb"

S = "${WORKDIR}/sick_scan-release-release-melodic-sick_scan-1.3.21-0"

inherit catkin
